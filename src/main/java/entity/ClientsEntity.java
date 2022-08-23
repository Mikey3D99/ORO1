package entity;

import javax.persistence.*;

@Entity
@Table(name = "clients", schema = "public", catalog = "ORO")
public class ClientsEntity {
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "surname")
    private String surname;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientsEntity that = (ClientsEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }
}
