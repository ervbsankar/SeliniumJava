public aspect DemoAspect {
    pointcut callDemoAspectPointcut() : call(* CollectionPrimitive.*(..));

    after() : callDemoAspectPointcut() {
        System.out.println("Demo Aspect Pointcut - after ...");
    }

    before() : execution(* CollectionPrimitive.*(..)) {
        System.out.println("Demo Aspect Pointcut - before ...");
    }

}