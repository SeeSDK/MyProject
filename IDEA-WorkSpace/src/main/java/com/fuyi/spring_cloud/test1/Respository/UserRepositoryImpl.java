package com.fuyi.spring_cloud.test1.Respository;

import com.fuyi.spring_cloud.test1.Respository.iml.UserRepository;
import com.fuyi.spring_cloud.test1.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private static AtomicLong counter = new AtomicLong();
    private final ConcurrentHashMap<Long, User> userMap = new ConcurrentHashMap<>();

    @Override
    public User saveOrUpadateUser(User user) {
        Long id = user.getId();
        if (id == null || id <= 0) {
            id = counter.incrementAndGet();
            //incrementAndGet（）和 getAndIncrement （）都调用了 Unsafe 类中的 getAndAddInt（） 方法，区别是：
            //
            //① 前者，先+1，再返回
            //
            //② 后者，先返回，再 +1
            user.setId(id);
        }
        this.userMap.put(id, user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        this.userMap.remove(id);

    }

    @Override
    public User getUserById(Long id) {

        return this.userMap.get(id);
    }

    @Override
    public List<User> listUser() {

        return new ArrayList<User>(this.userMap.values());
    }
}
