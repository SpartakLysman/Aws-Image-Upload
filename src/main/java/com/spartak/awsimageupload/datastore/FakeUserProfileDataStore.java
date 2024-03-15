package com.spartak.awsimageupload.datastore;

import com.spartak.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("a4929d21-bb27-4e38-b41d-55e726292e21"),
                "jamilamaila",
                null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("dd011062-f6b0-4373-a6c1-139755ae4645"),
                "antoniogroy",
                null));
    }

    public List<UserProfile> getUserProfiles () {
        return USER_PROFILES;
    }
}
