package org.infinispan.tutorial.simple.map;

import org.infinispan.Cache;
import org.infinispan.manager.DefaultCacheManager;

public class InfinispanMap {

   public static void main(String[] args) {
      // Construct a simple local cache manager with default configuration
      DefaultCacheManager cacheManager = new DefaultCacheManager();
      // Obtain the default cache
      Cache<String, String> cache = cacheManager.getCache();
      // Store a value
      cache.put("key1", "value1");
      // Retrieve the value and print it out
      System.out.printf("key1 = %s\n", cache.get("key1"));
      // Stop the cache manager and release all resources
      cacheManager.stop();
      
   }

}
