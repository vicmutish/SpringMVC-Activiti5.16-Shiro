package zml;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.util.ByteSource;

public class UserPassword {

    public static void main(String[] args) {
        ByteSource bytes = ByteSource.Util.bytes("admin123456");
        Md5Hash md5Hash = new Md5Hash("123456",bytes,2);
        System.out.println(md5Hash.toString());
    }

}
