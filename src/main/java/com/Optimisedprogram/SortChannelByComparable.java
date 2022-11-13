package com.Optimisedprogram;

import java.util.ArrayList;
import java.util.Collections;

/**   Channel 1  - 1000
	Channel 2  - 2554
	Channel 3  - 1000
	Channel 4  -   15
	Channel 5  -  503
*
* */


public class SortChannelByComparable {

    public static void main(String[] args) {
        ArrayList<Channel> al = new ArrayList<Channel>();
        al.add(new Channel ("channel 1",  1000));
        al.add(new Channel ("channel 2",  2554));
        al.add(new Channel ("channel 3",  1000));
        al.add(new Channel ("channel 4",  15));
        al.add(new Channel ("channel 5",  503));

        Collections.sort(al);

        for(Channel ch : al)
        {
            System.out.println(ch.channel + " ---> " +ch.value);
        }
    }


}


class Channel implements Comparable<Channel>
{
    String channel;
    long value;

    public Channel (String channel, long value)
    {
        this.channel = channel ;
        this.value = value;
    }

    @Override
    public int compareTo(Channel c) {
        if(value == c.value)
        {
            return 0;
        }else if (value > c.value)
        {
            return 1;
        }else
        {
            return -1;
        }
    }
}


