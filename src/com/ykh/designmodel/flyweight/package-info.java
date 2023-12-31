/**
 * 享元模式在JDK源码中的应用
 * {@link java.lang.Integer#valueOf(int)}
 *     public static Integer valueOf(int i) {
 *         if (i >= IntegerCache.low && i <= IntegerCache.high)
 *             return IntegerCache.cache[i + (-IntegerCache.low)];
 *         return new Integer(i);
 *     }
 *
 * 享元模式的注意事项和细节
 * 1. 在享元模式这样理解，“享”就表示共享，“元”表示对象
 * 2. 系统中有大量对象，这些对象消耗大量内存，并且对象的状态大部分可以外部化时我们就可以考虑选用享元模式
 * 3. 用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象，用3HashMap/HashTable存储
 * 4. 享元模式大大减少了对象的创建，降低了程序内存的占用，提高效率
 * 5. 享元模式提高了系统的复杂度。需要分离出内部状态和外部状态，而外部状态具有固化特性，不应该随着内部状态的改变而改变，这是我们使用享元模式需要注意的地方.
 * 6. 使用享元模式时，注意划分内部状态和外部状态，并且需要有一个工厂类加以控制.享元模式经典的应用场景是需要缓冲池的场景，比如 String常量池、数据库连接池
 *
 */
package com.ykh.designmodel.flyweight;
