package com.spike.giantdataanalysis.netty.support;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.oio.OioEventLoopGroup;

public class EventLoops {
  // ======================================== properties

  // ======================================== methods
  public static EventLoopGroup nio() {
    return new NioEventLoopGroup();
  }

  public static EventLoopGroup oio() {
    return new OioEventLoopGroup();
  }

  // ======================================== classes
}
