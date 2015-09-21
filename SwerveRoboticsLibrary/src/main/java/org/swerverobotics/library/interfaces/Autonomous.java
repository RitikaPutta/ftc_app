package org.swerverobotics.library.interfaces;

import java.lang.annotation.*;

/**
 * Provides an easy and non-centralized way of determining the OpMode list
 * shown on an FTC Driver Station.  Put an {@linkplain Autonomous} annotation on
 * your autonomous OpModes that you want to show up in the driver station display.
 *
 * If you want to temporarily disable an opmode, then set then also add
 * a {@linkplain Disabled} annotation to it.
 *
 * @see TeleOp
 * @see Disabled
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Autonomous
    {
    /**
     * The name to be used on the driver station display. If empty, the name of
     * the OpMode class will be used.
     */
    String name() default "";

    /**
     * Optionally indicate the name of a TeleOp class with whom
     * this Autonomous class is to be paired.
     */
    String pairWithTeleOp() default "";
    }
