package com.yaxi.ocr.ocr.util;

public class Test {


    public static void main(String[] args) {
        short s1 = 1;
        s1 += 1;
        System.out.println("s1 = " + s1);

        String s=
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Body>\n" +
                "    <UpdateAssignment xmlns=\"http://tempuri.org/\">\n" +
                "      <id>string</id>\n" +
                "      <activityid>string</activityid>\n" +
                "      <pathid>string</pathid>\n" +
                "      <memo>string</memo>\n" +
                "    </UpdateAssignment>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
    }
}
