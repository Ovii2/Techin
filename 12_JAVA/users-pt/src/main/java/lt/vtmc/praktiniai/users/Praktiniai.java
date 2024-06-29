package lt.vtmc.praktiniai.users;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        int count = 0;
        for (User olderUser : users) {
            if (olderUser.getAge() > 25) {
                count++;
            }
        }
        return count;
    }

    public static double getAverageAge(List<User> users) {
        int sumAge = 0;
        for (User avgUser : users) {
            sumAge += avgUser.getAge();
        }
        return (double) sumAge / users.size();
    }

    public static Integer getMinAge(List<User> users) {
        int min = users.get(0).getAge();
        for (User minUser : users) {
            if (minUser.getAge() < min) {
                min = minUser.getAge();
            }
        }
        return min;

    }

    public static User findByName(List<User> users, String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public static List<User> sortByAge(List<User> users) {
        Collections.sort(users, new AgeComparator());
//        Collections.sort(users, (o1,o2) -> o1.getAge() - o2.getAge());
        return users;
    }

    public static User findOldest(List<User> users) {
        User oldest = null;
        for (User user : users) {
            if (oldest == null || user.getAge() > oldest.getAge()) {
                oldest = user;
            }
        }
        return oldest;
    }

    public static int sumAge(List<User> users) {
        int sum = 0;
        for (User user : users) {
            sum += user.getAge();
        }
        return sum;
    }

}
