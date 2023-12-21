package board.boardspring.entity;

import board.boardspring.dto.UserDto;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class UserEntity{

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String userId;

    @Column
    private String password;

    @Column(unique = true)
    private String nickname;

    @Column
    private String email;

    public static UserEntity toUserEntity(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(userDto.getUserId());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setNickname(userDto.getNickname());
        userEntity.setEmail(userDto.getEmail());
        return userEntity;
    }

}
