package board.boardspring.dto;


import board.boardspring.entity.UserEntity;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {

    private Long id;
    private String userId;
    private String password;
    private String nickname;
    private String email;

    public static UserDto toUserDto(UserEntity userEntity){
        UserDto userDto = new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setUserId(userEntity.getUserId());
        userDto.setPassword(userEntity.getPassword());
        userDto.setNickname(userEntity.getNickname());
        userDto.setEmail(userEntity.getEmail());
        return userDto;
    }
}
