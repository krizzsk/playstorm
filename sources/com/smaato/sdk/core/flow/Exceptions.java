package com.smaato.sdk.core.flow;

abstract class Exceptions {
    private Exceptions() {
    }

    static void throwIfFatal(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        } else if (th instanceof AssertionError) {
            throw ((AssertionError) th);
        }
    }
}
