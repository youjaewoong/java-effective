package me.whiteship.chapter01.item07.optional;

import org.junit.jupiter.api.Test;

import me.easytodo.chapter01.item07.optional.Channel;
import me.easytodo.chapter01.item07.optional.MemberShip;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ChannelTest {

    @Test
    void npe() {
        Channel channel = new Channel();
        Optional<MemberShip> optional = channel.defaultMemberShip();
        optional.ifPresent(MemberShip::hello);
    }

}