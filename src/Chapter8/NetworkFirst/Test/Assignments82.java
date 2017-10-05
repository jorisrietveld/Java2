package NetworkFirst.Test;

import NetworkFirst.MessagePost;
import NetworkFirst.NewsFeed;
import NetworkFirst.PhotoPost;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Assignments82
{
    NewsFeed newsFeed = new NewsFeed();

    public void initMessages()
    {
        ArrayList<MessagePost> messages = new ArrayList<MessagePost>()
        {{
            add( new MessagePost( "Bob", "secret message" ) );
            add( new MessagePost( "Eve", "Ciphertext" ) );
            add( new MessagePost( "Alice", "Decrypted message" ) );
        }};

        messages.forEach( messagePost -> newsFeed.addMessagePost( messagePost ) );
    }

    public void initPhotos()
    {
        ArrayList<PhotoPost> photos = new ArrayList<PhotoPost>()
        {{
            add( new PhotoPost( "xkcd", "img1.png", "To damn accurate!"  ));
            add( new PhotoPost( "xkcd", "img2.png", "Try mindfck..."  ));
            add( new PhotoPost( "xkcd", "img3.png", "Currently testing this hypotheses" ));
        }};

        photos.forEach( photo -> {
            photo.addComment( "Some Comment" );
            IntStream.range( 0, 5 ).forEach( i -> photo.like() );
            newsFeed.addPhotoPost( photo );
        } );
    }

    public static void main( String[] args )
    {
        Assignments82 assignment = new Assignments82();
        assignment.initMessages();
        assignment.initPhotos();
        assignment.newsFeed.show();

    }
}
