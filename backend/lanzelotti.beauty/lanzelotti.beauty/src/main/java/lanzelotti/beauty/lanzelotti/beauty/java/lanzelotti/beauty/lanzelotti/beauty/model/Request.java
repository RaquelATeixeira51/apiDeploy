package lanzelotti.beauty.lanzelotti.beauty.java.lanzelotti.beauty.lanzelotti.beauty.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String cname;
    @Column
    private String email;
    @Column
    private String cpf;
    @Column
    private String phone;
    @Column
    private String cep;
    @Column
    private String street;
    @Column
    private int cnumber;
    @Column
    private String neighborhood;
    @Column
    private String complement;
    @Column
    private String state;
    @Column
    private int status;
    @Column
    private String cdate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    @Column 
    private int cost;
    @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "id")
    private Service service;
    
    @ManyToOne
    @JoinColumn(name = "product_oil_id", referencedColumnName = "id")
    private Product product;

    public Request(long id, String cname, String email, String cpf, String phone,
            String cep, String street, int cnumber, String neighborhood, String complement,
            String state, int status, int cost, Service service, Product product) {
        this.id = id;
        this.cname = cname;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
        this.cep = cep;
        this.street = street;
        this.cnumber = cnumber;
        this.neighborhood = neighborhood;
        this.complement = complement;
        this.state = state;
        this.status = status;
        this.service = service;
        this.product = product;
        this.cost = cost;
    } 
    
    public Request() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getcname() {
        return cname;
    }
    public void setcname(String cname) {
        this.cname = cname;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }
    public String getcpf() {
        return cpf;
    }
    public void setcpf(String cpf) {
        this.cpf = cpf;
    }
    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        this.phone = phone;
    }
    public String getcep() {
        return cep;
    }
    public void setcep(String cep) {
        this.cep = cep;
    }
    public String getstreet() {
        return street;
    }
    public void setstreet(String street) {
        this.street = street;
    }
    public int getcnumber() {
        return cnumber;
    }
    public void setcnumber(int cnumber) {
        this.cnumber = cnumber;
    }
    public String getneighborhood() {
        return neighborhood;
    }
    public void setneighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
    public String getcomplement() {
        return complement;
    }
    public void setcomplement(String complement) {
        this.complement = complement;
    }
    public String getstate() {
        return state;
    }
    public void setstate(String state) {
        this.state = state;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public Service getService() {
        return service;
    }
    public void setService(Service service) {
        this.service = service;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String createdDate) {
        this.cdate = createdDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
}
