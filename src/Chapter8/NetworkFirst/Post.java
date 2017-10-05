package NetworkFirst;

/**
 * The interface Post.
 */
public interface Post
{
    /**
     * Record one more 'Like' indication from a user.
     */
    void like();

    /**
     * Record that a user has withdrawn his/her 'Like' vote.
     */
    void unlike();

    /**
     * Add a comment to this post.
     *
     * @param text The new comment to add.
     */
    void addComment(String text);

    /**
     * Gets time stamp.
     *
     * @return the time stamp
     */
    long getTimeStamp();

    /**
     * Displays the post.
     */
    void display();
}
