import lt.vtvpmc.java.postoffice.IllegalPackageException;
import lt.vtvpmc.java.postoffice.Package;
import lt.vtvpmc.java.postoffice.PostOffice;

import java.util.ArrayList;

public class MyPostOffice implements PostOffice {
    ArrayList<Package> list = new ArrayList<>();

    @Override
    public void postPackage(Package aPackage) throws IllegalPackageException {
        if (aPackage.getOwner() == null || aPackage.getPackageCode() == null || aPackage.getPackageCode().isEmpty() || aPackage.getOwner().isEmpty()) {
            throw new IllegalPackageException();
        }
        list.add(aPackage);
    }

    @Override
    public long numberOfPackagesForOwner(String s) {
        return list.stream()
                .filter(owner -> owner.getOwner().contains(s)).count();
    }

    @Override
    public Package retrievePackage(String s) {
        Package receivedPackage = list.stream()
                .filter(p -> p.getPackageCode().contains(s))
                .findFirst().orElse(null);

        if (receivedPackage != null) {
            list.remove(receivedPackage);
        }
        return receivedPackage;
    }
}
