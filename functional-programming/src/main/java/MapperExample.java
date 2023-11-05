import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Bannana", "Grape","guava");

        names.stream().filter(MapperExample::IsnotApple)
                .map(User::new)
                .forEach(System.out::println);


       List<User> userList =  names.stream().filter(MapperExample::IsnotApple)
                .map(User::new)
                .collect(Collectors.toList());
    }

    private static boolean IsnotApple(String Name) {
        return !Name.equals("Apple");
    }

   static class User{
        private String Name;

        @Override
        public String toString() {
            return "User{" +
                    "Name='" + Name + '\'' +
                    ", Price=" + Price +
                    '}';
        }

        private Integer Price = 30;

        public User(String name) {
            Name = name;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public Integer getPrice() {
            return Price;
        }

        public void setPrice(Integer Price) {
            Price = Price;
        }
    }
}
