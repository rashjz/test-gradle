package rashjz.info.app.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by rasha_000 on 1/14/2017.
 */
@Entity
@Table(name = "in_out", schema = "", catalog = "socsec")
public class InOutEntity {
    private int id;
    private String userId;
    private Timestamp insDate;
    private Integer packId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "ins_date")
    public Timestamp getInsDate() {
        return insDate;
    }

    public void setInsDate(Timestamp insDate) {
        this.insDate = insDate;
    }

    @Basic
    @Column(name = "pack_id")
    public Integer getPackId() {
        return packId;
    }

    public void setPackId(Integer packId) {
        this.packId = packId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InOutEntity that = (InOutEntity) o;

        if (id != that.id) return false;
        if (insDate != null ? !insDate.equals(that.insDate) : that.insDate != null) return false;
        if (packId != null ? !packId.equals(that.packId) : that.packId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (insDate != null ? insDate.hashCode() : 0);
        result = 31 * result + (packId != null ? packId.hashCode() : 0);
        return result;
    }
}
