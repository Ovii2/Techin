package lt.techin.ovidijus;

import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PostStamp;

import java.util.*;

public class PhilatelistImpl extends NameComparator implements Philatelist {

    private List<PostStamp> postStamps;

    public PhilatelistImpl() {
        this.postStamps = new ArrayList<>();
    }

    @Override
    public void addToCollection(PostStamp postStamp) {
        if (postStamp == null || postStamp.getName() == null || postStamp.getName().isEmpty())
            throw new IllegalArgumentException();
        postStamps.add(postStamp);
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return postStamps.size();
    }

    @Override
    public void printAllPostStampNames() {
        postStamps.stream()
                .map(PostStamp::getName)
                .forEach(System.out::println);
//        for (PostStamp p : postStamps) {
//            System.out.println(p.getName());
//        }
    }

    @Override
    public void printPostStampsWithPriceGreaterThan(double v) {
        postStamps.stream()
                .filter(p -> p.getMarketPrice() > v)
                .map(PostStamp::getName)
                .forEach(System.out::println);

//        for (PostStamp p : postStamps) {
//            if (p.getMarketPrice() > v) {
//                System.out.println(p.getName());
//            }
//        }
    }

    @Override
    public boolean isPostStampInCollection(PostStamp postStamp) {
        return postStamps.stream()
                .anyMatch(stamp -> stamp.equals(postStamp));
//        return this.postStamps.contains(postStamp);
    }

    @Override
    public boolean isPostStampWithNameInCollection(String s) {
        return postStamps.stream()
                .anyMatch(stamp -> stamp.getName().equals(s));
//        for (PostStamp p : postStamps) {
//            if (p.getName().equals(s)) {
//                return true;
//            }
//        }
//        return false;
    }

    @Override
    public double calculateTotalMarketPrice() {
        return postStamps.stream()
                .mapToDouble(PostStamp::getMarketPrice)
                .sum();
//        double total = 0;
//        for (PostStamp p : postStamps) {
//            total += p.getMarketPrice();
//        }
//        return total;
    }

    @Override
    public double getAveragePostStampPrice() {
        return postStamps.stream()
                .mapToDouble(PostStamp::getMarketPrice)
                .average()
                .orElse(0.0);
//        double total = 0;
//        for (PostStamp p : postStamps) {
//            total += p.getMarketPrice();
//        }
//        return total / postStamps.size();
    }

    @Override
    public PostStamp getTheMostExpensivePostStampByMarketValue() {
        return postStamps.stream()
                .max(Comparator.comparing(PostStamp::getMarketPrice))
                .orElse(null);
//        PostStamp max = postStamps.get(0);
//        for (PostStamp p : postStamps) {
//            if (max.getMarketPrice() < p.getMarketPrice()) {
//                max = p;
//            }
//        }
//        return max;

    }

    @Override
    public List<PostStamp> findPostStampsByNameContaining(String s) {
        return postStamps.stream()
                .filter(name -> name.getName().contains(s))
                .toList();
//        List<PostStamp> result = new ArrayList<>();
//        for (PostStamp p : postStamps) {
//            if (p.getName().contains(s)) {
//                result.add(p);
//            }
//
//        }
//        return result;
    }

    @Override
    public List<PostStamp> getSortedPostStampsByName() {
        return postStamps.stream().sorted((Comparator.comparing(PostStamp::getName))).toList();
//        return postStamps.stream().sorted(((o1, o2) -> o1.getName().compareTo(o2.getName()))).toList();
//        Collections.sort(postStamps, ((o1, o2) -> o1.getName().compareTo(o2.getName())));
//        Collections.sort(postStamps, new NameComparator());
//        return postStamps;
    }
}