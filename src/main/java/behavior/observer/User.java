package behavior.observer;

class User implements Follower {
      Page page;

      public User(Page page) {
            this.page = page;
            page.registerFollower(this);
      }

      public void update() {
            System.out.println(
                  "Latest post seen by a normal user: " + page.getLatestPost()
            );
      }
}