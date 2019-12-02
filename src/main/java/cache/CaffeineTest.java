package cache;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.Expiry;

import java.time.Duration;

public class CaffeineTest {
    
    public static void main(String[] args) {
        Cache cache = getCache();
        cache.put("a", 1);
        System.out.println(cache.getIfPresent("a"));
        System.out.println(cache.getIfPresent("a"));
        
    }
    
    private static Cache getCache() {
        return Caffeine.newBuilder()
//                       .expireAfterAccess(Duration.ZERO)
                       .expireAfter(new Expiry() {
                           @Override
                           public long expireAfterCreate(Object key, Object value, long currentTime) {
                               return Long.MAX_VALUE;
                           }
    
                           @Override
                           public long expireAfterUpdate(Object key, Object value, long currentTime, long currentDuration) {
                               return Long.MAX_VALUE;
                           }
    
                           @Override
                           public long expireAfterRead(Object key, Object value, long currentTime, long currentDuration) {
                               return 0;
                           }
                       })
                       .initialCapacity(10)
                       .maximumSize(10)
                       .build();
        //.expireAfterRead(null, null, 0, 0)
    }
    
}
