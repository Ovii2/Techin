package lt.techin.ovidijus;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.*;
import java.util.stream.Collectors;

public class MySocialNetwork implements SocialNetwork {

    private Set<Friend> list = new HashSet<>();

    @Override
    public void addFriend(Friend friend) {
        if (friend == null) {
            throw new IllegalArgumentException();
        }
        list.add(friend);
    }

    @Override
    public int getNumberOfFriends() {
        return list.size();

    }

    @Override
    public Friend findFriend(String s, String s1) throws FriendNotFoundException {
        if (s == null || s1 == null) {
            throw new IllegalArgumentException();
        }
        return list.stream()
                .filter(f -> f.getFirstName().contains(s) && f.getLastName().contains(s1))
                .findFirst()
                .orElseThrow(() -> new FriendNotFoundException(s, s1));
    }

    @Override
    public Collection<Friend> findByCity(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }
        return list.stream().filter(city -> city.getCity().contains(s)).toList();
    }

    @Override
    public Collection<Friend> getOrderedFriends() {
        return list.stream()
                .sorted(Comparator.comparing(Friend::getCity)
                        .thenComparing(Friend::getLastName)
                        .thenComparing(Friend::getFirstName))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
