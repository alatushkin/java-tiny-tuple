# java-tiny-tuple

Tiny library with immutable Tuple implementation
can help to avoid creating new types when you want to return more than one value 
but don't want to create new classes (when using Stream API and in other situations)  


API example
```java
// to use T2("some text", 3453) instead of new T2<>("some text", 3453)
import static name.alatushkin.shared.tuple.T2.T2;

...

<Integer, String> tuple2 = T2(12, "text");
T3<String, Integer, int[]> tuple3 = T2("some text", 3453).append(new int[]{123, 123, 123});
        
//tuples are immutable. On every setter new tuple is created
T3<String, Integer, int[]> tuple3_1 = tuple3.setM(12);
T3<int[], String, Integer> tuple3_2 = tuple3.shiftR();
T3<String, Integer, int[]> tuple3_3 = tuple3.setL("new value").setM(123);

T2<String, Integer> tuple2_2 = tuple3.begin();
T2<Integer, int[]> tuple2_3 = tuple3.end();

String l = tuple3.l;
Integer m = tuple3.m;
int[] r = tuple3.r;
```
