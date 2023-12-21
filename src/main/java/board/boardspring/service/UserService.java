package board.boardspring.service;

import board.boardspring.dto.UserDto;
import board.boardspring.entity.UserEntity;
import board.boardspring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void save(UserDto dto){
        // 1. dto -> entity 변환
        // 2. repository의 save 메서드 호출
        UserEntity userEntity = UserEntity.toUserEntity(dto);
        userRepository.save(userEntity);
    }
}
