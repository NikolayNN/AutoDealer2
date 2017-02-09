package my.project.autodealer.dao.repositories;

import javax.persistence.*;

/**
 * Created by Nikol on 1/30/2017.
 */
@Entity
@Table(name = "car")
public class CarRepository {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="owner_info_id")
    OwnerInfoRepository ownerinfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="maker_info_id")
    MakerInfoRepository makerinfo;

    public CarRepository() {
    }

    public CarRepository(MakerInfoRepository makerInfoRepository, OwnerInfoRepository ownerInfoRepository) {
        this.makerinfo = makerInfoRepository;
        this.ownerinfo = ownerInfoRepository;
    }

    public OwnerInfoRepository getOwnerinfo() {
        return ownerinfo;
    }

    public void setOwnerinfo(OwnerInfoRepository ownerinfo) {
        this.ownerinfo = ownerinfo;
    }

    public MakerInfoRepository getMakerinfo() {
        return makerinfo;
    }

    public void setMakerinfo(MakerInfoRepository makerinfo) {
        this.makerinfo = makerinfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarRepository that = (CarRepository) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
