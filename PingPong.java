package discordbot_test;

import com.google.common.util.concurrent.FutureCallback;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.Javacord;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.javacord.listener.message.MessageCreateListener;

public class PingPong {
	int x;
    public PingPong(String token) {
        // See "How to get the token" below
        DiscordAPI api = Javacord.getApi("408020235833311244", true);
        // connect
        api.connect(new FutureCallback<DiscordAPI>() {
            @Override
            public void onSuccess(DiscordAPI api) {
                // register listener
                api.registerListener(new MessageCreateListener() {
                    @Override
                    public void onMessageCreate(DiscordAPI api, Message message) {
                        // check the content of the message
                        if (message.getContent().equalsIgnoreCase("blini")) {
                            // reply to the message
                            message.reply("pong");}
                        else if (message.getContent().equalsIgnoreCase(""))   {
                        	while (x>25) {
                        	Kappa.blini();
                        	continue;}
                        	x++;}
                        	x=0;
                        	                       }    
                });
            }

            @Override
            public void onFailure(Throwable t) {
                t.printStackTrace();
            }
        });
    }

}

