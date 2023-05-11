package br.com.webflux.webfluxcourse.service;

import br.com.webflux.webfluxcourse.entity.User;
import br.com.webflux.webfluxcourse.mapper.UserMapper;
import br.com.webflux.webfluxcourse.model.request.UserRequest;
import br.com.webflux.webfluxcourse.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;
    public Mono<User> save(final UserRequest request) {
        return repository.save(mapper.toEntity(request));
    }
}
