package ru.nb.mce.core_ui;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\"\u0016\u0010\u0000\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\f\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u000e\u0010\u0003\"\u0016\u0010\u000f\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\u0003\"\u0016\u0010\u0011\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0012\u0010\u0003\"\u0016\u0010\u0013\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0014\u0010\u0003\"\u0016\u0010\u0015\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0016\u0010\u0003\"\u0016\u0010\u0017\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0018\u0010\u0003\"\u0016\u0010\u0019\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u001a\u0010\u0003\"\u0016\u0010\u001b\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u001c\u0010\u0003\"\u0016\u0010\u001d\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u001e\u0010\u0003\"\u0016\u0010\u001f\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b \u0010\u0003\"\u0016\u0010!\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\"\u0010\u0003\"\u0016\u0010#\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b$\u0010\u0003\"\u0016\u0010%\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b&\u0010\u0003\"\u0016\u0010\'\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b(\u0010\u0003\"\u0016\u0010)\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b*\u0010\u0003\"\u0016\u0010+\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b,\u0010\u0003\"\u0016\u0010-\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b.\u0010\u0003\"\u0016\u0010/\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b0\u0010\u0003\"\u0016\u00101\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b2\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00063"}, d2 = {"Background", "Landroidx/compose/ui/graphics/Color;", "getBackground", "()J", "J", "BackgroundNight", "getBackgroundNight", "DeleteColor", "getDeleteColor", "OnBackground", "getOnBackground", "OnBackgroundNight", "getOnBackgroundNight", "OnError", "getOnError", "OnErrorNight", "getOnErrorNight", "OnPrimary", "getOnPrimary", "OnPrimaryNight", "getOnPrimaryNight", "OnSecondary", "getOnSecondary", "OnSecondaryNight", "getOnSecondaryNight", "OnSurface", "getOnSurface", "OnSurfaceNight", "getOnSurfaceNight", "Primary", "getPrimary", "PrimaryNight", "getPrimaryNight", "PrimaryVariant", "getPrimaryVariant", "PrimaryVariantNight", "getPrimaryVariantNight", "Secondary", "getSecondary", "SecondaryNight", "getSecondaryNight", "SecondaryVariant", "getSecondaryVariant", "SecondaryVariantNight", "getSecondaryVariantNight", "Surface", "getSurface", "SurfaceNight", "getSurfaceNight", "Transparent", "getTransparent", "core-ui_debug"})
public final class ColorKt {
    private static final long Primary = 0L;
    private static final long PrimaryVariant = 0L;
    private static final long Secondary = 0L;
    private static final long SecondaryVariant = 0L;
    private static final long Background = 0L;
    private static final long Surface = 0L;
    private static final long OnPrimary = 0L;
    private static final long OnSecondary = 0L;
    private static final long OnBackground = 0L;
    private static final long OnSurface = 0L;
    private static final long OnError = 0L;
    private static final long PrimaryNight = 0L;
    private static final long PrimaryVariantNight = 0L;
    private static final long SecondaryNight = 0L;
    private static final long SecondaryVariantNight = 0L;
    private static final long BackgroundNight = 0L;
    private static final long SurfaceNight = 0L;
    private static final long OnPrimaryNight = 0L;
    private static final long OnBackgroundNight = 0L;
    private static final long OnSecondaryNight = 0L;
    private static final long OnSurfaceNight = 0L;
    private static final long OnErrorNight = 0L;
    private static final long DeleteColor = 0L;
    private static final long Transparent = 0L;
    
    public static final long getPrimary() {
        return 0L;
    }
    
    public static final long getPrimaryVariant() {
        return 0L;
    }
    
    public static final long getSecondary() {
        return 0L;
    }
    
    public static final long getSecondaryVariant() {
        return 0L;
    }
    
    public static final long getBackground() {
        return 0L;
    }
    
    public static final long getSurface() {
        return 0L;
    }
    
    public static final long getOnPrimary() {
        return 0L;
    }
    
    public static final long getOnSecondary() {
        return 0L;
    }
    
    public static final long getOnBackground() {
        return 0L;
    }
    
    public static final long getOnSurface() {
        return 0L;
    }
    
    public static final long getOnError() {
        return 0L;
    }
    
    public static final long getPrimaryNight() {
        return 0L;
    }
    
    public static final long getPrimaryVariantNight() {
        return 0L;
    }
    
    public static final long getSecondaryNight() {
        return 0L;
    }
    
    public static final long getSecondaryVariantNight() {
        return 0L;
    }
    
    public static final long getBackgroundNight() {
        return 0L;
    }
    
    public static final long getSurfaceNight() {
        return 0L;
    }
    
    public static final long getOnPrimaryNight() {
        return 0L;
    }
    
    public static final long getOnBackgroundNight() {
        return 0L;
    }
    
    public static final long getOnSecondaryNight() {
        return 0L;
    }
    
    public static final long getOnSurfaceNight() {
        return 0L;
    }
    
    public static final long getOnErrorNight() {
        return 0L;
    }
    
    public static final long getDeleteColor() {
        return 0L;
    }
    
    public static final long getTransparent() {
        return 0L;
    }
}