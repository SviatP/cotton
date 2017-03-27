package com.bionic.baglab.domains;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by username on 11.03.2017.
 */

@Entity
@Table(name = "user", schema = "baglab")
public class UserEntity {

    public final static String user = "Admin";

    private int idUser;
    private String login;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
    private UserRole role;
    private Integer statusId;
    private Timestamp userCreate;
    private Timestamp userUpdate;
    private byte deleted;

    public UserEntity() {
    }

    public UserEntity(int id) {
        this.idUser = id;
    }

    public UserEntity(String email, String lastname) {
        this.email = email;
        this.lastname = lastname;
    }
    /* private Collection<FeedbackEntity> feedbacksByIdUser;
    private Collection<ModelEntity> modelsByIdUser;
    private Collection<OrderEntity> ordersByIdUser;
    private Collection<ShippingAdressEntity> shippingAdressesByIdUser;
    private UserRoles roleByRoleId;
    private UserStatusEntity userStatusByStatusId;*/

    @Id
    @Column(name = "idUser")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @OneToOne
    @JoinColumn(name = "roleId")
    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Basic
    @Column(name = "statusId")
    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "userCreate")
    public Timestamp getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(Timestamp userCreate) {
        this.userCreate = userCreate;
    }

    @Basic
    @Column(name = "userUpdate")
    public Timestamp getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(Timestamp userUpdate) {
        this.userUpdate = userUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (idUser != that.idUser) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (userCreate != null ? !userCreate.equals(that.userCreate) : that.userCreate != null) return false;
        if (userUpdate != null ? !userUpdate.equals(that.userUpdate) : that.userUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (userCreate != null ? userCreate.hashCode() : 0);
        result = 31 * result + (userUpdate != null ? userUpdate.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "deleted", columnDefinition = "BitTypeDescriptor")
    //@Type(type = "org.hibernate.type.BigIntegerType") org.hibernate.type.descr
    public byte getDeleted() {
        return deleted;
    }

    public void setDeleted(byte deleted) {
        this.deleted = deleted;
    }
/*
    @OneToMany(mappedBy = "userByUserId")
    public Collection<FeedbackEntity> getFeedbacksByIdUser() {
        return feedbacksByIdUser;
    }

    public void setFeedbacksByIdUser(Collection<FeedbackEntity> feedbacksByIdUser) {
        this.feedbacksByIdUser = feedbacksByIdUser;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<ModelEntity> getModelsByIdUser() {
        return modelsByIdUser;
    }

    public void setModelsByIdUser(Collection<ModelEntity> modelsByIdUser) {
        this.modelsByIdUser = modelsByIdUser;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<OrderEntity> getOrdersByIdUser() {
        return ordersByIdUser;
    }

    public void setOrdersByIdUser(Collection<OrderEntity> ordersByIdUser) {
        this.ordersByIdUser = ordersByIdUser;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<ShippingAdressEntity> getShippingAdressesByIdUser() {
        return shippingAdressesByIdUser;
    }

    public void setShippingAdressesByIdUser(Collection<ShippingAdressEntity> shippingAdressesByIdUser) {
        this.shippingAdressesByIdUser = shippingAdressesByIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "roleId", referencedColumnName = "idRole")
    public UserRoles getRoleByRoleId() {
        return roleByRoleId;
    }

    public void setRoleByRoleId(UserRoles roleByRoleId) {
        this.roleByRoleId = roleByRoleId;
    }

    @ManyToOne
    @JoinColumn(name = "statusId", referencedColumnName = "idstatus")
    public UserStatusEntity getUserStatusByStatusId() {
        return userStatusByStatusId;
    }

    public void setUserStatusByStatusId(UserStatusEntity userStatusByStatusId) {
        this.userStatusByStatusId = userStatusByStatusId;
    } */
}
