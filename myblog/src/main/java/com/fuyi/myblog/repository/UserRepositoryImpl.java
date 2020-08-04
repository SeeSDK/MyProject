//package com.seesdk.myblog.repository;
//import com.seesdk.myblog.domain.User;
//import org.springframework.stereotype.Service;
//import javax.annotation.Resource;
//import javax.transaction.Transactional;
//import java.util.Optional;
//import java.util.concurrent.atomic.AtomicLong;
//
//@Service
//@Transactional
//public class UserRepositoryImpl implements UserRepository {
//    private static AtomicLong counter=new AtomicLong();
//
//    @Resource
//    UserRepository UserRepository;
//    @Override
//    public <S extends User> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//
//    @Override
//    public Optional<User> findById(Long id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long id) {
//        return false;
//    }
//
//
//    @Override
//    public Iterable<User> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<User> findAllById(Iterable<Long> longs) {
//        return null;
//    }
//
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long integer) {
//
//    }
//
//
//    @Override
//    public void delete(User entity) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends User> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//}
