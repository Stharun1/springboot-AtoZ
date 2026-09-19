package com.masterclass.corejava.accessmodifiers;

/**
 * Demonstrates visibility across the 4 Java access modifiers:
 * 1. public    - Visible everywhere
 * 2. protected - Visible in same package + subclasses in external packages
 * 3. default   - (package-private) Visible only in same package
 * 4. private   - Visible only within the declaring class
 */
public class BaseAccessDemo {

    public String publicField = "Public: Accessible Anywhere";
    protected String protectedField = "Protected: Same Package + Subclasses";
    String packagePrivateField = "Default: Same Package Only";
    private String privateField = "Private: Declaring Class Only";

    public void demonstrateInternalAccess() {
        System.out.println("--- Inside Declaring Class (BaseAccessDemo) ---");
        System.out.println(publicField);
        System.out.println(protectedField);
        System.out.println(packagePrivateField);
        System.out.println(privateField);
    }

    public String getPrivateField() {
        return privateField;
    }
}
