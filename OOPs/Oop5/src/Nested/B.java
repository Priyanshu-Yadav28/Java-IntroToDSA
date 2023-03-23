package Nested;
public class B implements A.NestedInterface {
        @Override
        public boolean isOdd(int num) {
            return (num & 1) == 1;
        }
}

