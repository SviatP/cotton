package com.bionic.baglab.dto;

import com.bionic.baglab.domains.UserEntity;

/**
 * Created by username on 3/26/17.
 */
public class UserDto {
    private int idUser;
    private String email;
    private String firstname;
    private String lastname;

    public UserDto(UserEntity userEntity) {
        this.idUser=userEntity.getIdUser();
        this.email=userEntity.getEmail();
        this.firstname=userEntity.getFirstname();
        this.lastname=userEntity.getLastname();
    }

    public int getIdUser() {

        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDto userDto = (UserDto) o;

        if (idUser != userDto.idUser) return false;
        if (email != null ? !email.equals(userDto.email) : userDto.email != null) return false;
        if (firstname != null ? !firstname.equals(userDto.firstname) : userDto.firstname != null) return false;
        return lastname != null ? lastname.equals(userDto.lastname) : userDto.lastname == null;

    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }
}
