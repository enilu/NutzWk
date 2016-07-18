package cn.wizzer.common.core;

import org.h2.tools.Server;
import org.nutz.log.Log;
import org.nutz.log.Logs;

import java.io.File;
import java.sql.SQLException;

/**
 * class H2Server<br>
 * </p> Copyright by easecredit.com<br>
 * 作者: zhangtao <br>
 * 创建日期: 16-7-18<br>
 */
public class H2Server {
    private static final Log log = Logs.get();

    private static Server h2Server;
    /**
     * 启动h2服务
     */
    public static void startH2Server() {
        if (h2Server != null && h2Server.isRunning(true)) {
            return;
        }
        try {
            log.info("database path is " + "正在启动h2...");
            boolean dbIsActive = new File("h2db").isDirectory();
            log.info("database path is " + new File("h2db").getAbsolutePath());
            h2Server = Server.createPgServer(new String[]{"-baseDir", "h2db"}).start();
        } catch (SQLException e) {
            log.error("启动h2出错：" + e.toString());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        log.info("数据库启动完毕...");
    }
    public static  void stopH2Server() {
        if ( h2Server!= null) {
            log.info("正在关闭h2...");
            h2Server.stop();
            log.info("关闭成功.");
        }
    }
}
