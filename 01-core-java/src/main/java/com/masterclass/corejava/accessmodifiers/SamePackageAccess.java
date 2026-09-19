package com.masterclass.corejava.accessmodifiers;

public class SamePackageAccess {

    public void demonstrateSamePackageAccess() {
        BaseAccessDemo base = new BaseAccessDemo();
        System.out.println("--- Inside Same Package (SamePackageAccess) ---");
        System.out.println(base.publicField);          // Accessible
        System.out.println(base.protectedField);       // Accessible (same package)
        System.out.println(base.packagePrivateField);  // Accessible (same package)
        // System.out.println(base.privateField);     // COMPILER ERROR: private field not accessible
        System.out.println("Private Field (via getter): " + base.getPrivateField());
    }
}
