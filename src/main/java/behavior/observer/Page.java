package behavior.observer;

import java.util.ArrayList;

class Page {
      private ArrayList<Follower> followers;
      String latestPost;

      public Page() {
            followers = new ArrayList();
      }

      public void registerFollower(Follower f) {
            followers.add(f);
      }

      public void notifyFollowers() {
            followers.forEach(Follower::update);
      }

      public String getLatestPost() {
            return latestPost;
      }

      public void addNewPost(String post) {
            this.latestPost = post;
            notifyFollowers();
      }
}