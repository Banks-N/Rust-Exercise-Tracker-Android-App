// Automatically generated by flapigen
package com.example.rustapplication.lib;
import androidx.annotation.NonNull;

public final class History {

    public History(@NonNull String start_date) {
        mNativeObj = init(start_date);
    }
    private static native long init(@NonNull String start_date);

    public final void addExercise(@NonNull Exercise exercise) {
        long a0 = exercise.mNativeObj;
        exercise.mNativeObj = 0;

        do_addExercise(mNativeObj, a0);

        JNIReachabilityFence.reachabilityFence1(exercise);
    }
    private static native void do_addExercise(long self, long exercise);

    public final @NonNull String getLogString() {
        String ret = do_getLogString(mNativeObj);

        return ret;
    }
    private static native @NonNull String do_getLogString(long self);

    public synchronized void delete() {
        if (mNativeObj != 0) {
            do_delete(mNativeObj);
            mNativeObj = 0;
       }
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            delete();
        }
        finally {
             super.finalize();
        }
    }
    private static native void do_delete(long me);
    /*package*/ History(InternalPointerMarker marker, long ptr) {
        assert marker == InternalPointerMarker.RAW_PTR;
        this.mNativeObj = ptr;
    }
    /*package*/ long mNativeObj;
}