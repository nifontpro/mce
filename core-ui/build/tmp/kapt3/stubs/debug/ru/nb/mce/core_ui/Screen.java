package ru.nb.mce.core_ui;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0007\b\t\n\u000b\f\r\u000e\u000fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u00a8\u0006\u0019"}, d2 = {"Lru/nb/mce/core_ui/Screen;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "ExtEventUpdateScreen", "ExtNewEventScreen", "ExtPersonInfoScreen", "ExtTemplatesScreen", "MainScreen", "NavEventScreen", "NavGroupScreen", "NavPersonScreen", "NavSettingScreen", "Lru/nb/mce/core_ui/Screen$ExtEventUpdateScreen;", "Lru/nb/mce/core_ui/Screen$ExtNewEventScreen;", "Lru/nb/mce/core_ui/Screen$ExtPersonInfoScreen;", "Lru/nb/mce/core_ui/Screen$ExtTemplatesScreen;", "Lru/nb/mce/core_ui/Screen$MainScreen;", "Lru/nb/mce/core_ui/Screen$NavEventScreen;", "Lru/nb/mce/core_ui/Screen$NavGroupScreen;", "Lru/nb/mce/core_ui/Screen$NavPersonScreen;", "Lru/nb/mce/core_ui/Screen$NavSettingScreen;", "core-ui_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    
    private Screen(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a8\u0006\b"}, d2 = {"Lru/nb/mce/core_ui/Screen$ExtEventUpdateScreen;", "Lru/nb/mce/core_ui/Screen;", "()V", "createRoute", "", "personId", "", "eventId", "core-ui_debug"})
    public static final class ExtEventUpdateScreen extends ru.nb.mce.core_ui.Screen {
        @org.jetbrains.annotations.NotNull
        public static final ru.nb.mce.core_ui.Screen.ExtEventUpdateScreen INSTANCE = null;
        
        private ExtEventUpdateScreen() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String createRoute(long personId, long eventId) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/nb/mce/core_ui/Screen$ExtNewEventScreen;", "Lru/nb/mce/core_ui/Screen;", "()V", "createRoute", "", "personId", "", "core-ui_debug"})
    public static final class ExtNewEventScreen extends ru.nb.mce.core_ui.Screen {
        @org.jetbrains.annotations.NotNull
        public static final ru.nb.mce.core_ui.Screen.ExtNewEventScreen INSTANCE = null;
        
        private ExtNewEventScreen() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String createRoute(long personId) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/nb/mce/core_ui/Screen$ExtPersonInfoScreen;", "Lru/nb/mce/core_ui/Screen;", "()V", "createRoute", "", "personId", "", "core-ui_debug"})
    public static final class ExtPersonInfoScreen extends ru.nb.mce.core_ui.Screen {
        @org.jetbrains.annotations.NotNull
        public static final ru.nb.mce.core_ui.Screen.ExtPersonInfoScreen INSTANCE = null;
        
        private ExtPersonInfoScreen() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String createRoute(long personId) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/nb/mce/core_ui/Screen$ExtTemplatesScreen;", "Lru/nb/mce/core_ui/Screen;", "()V", "core-ui_debug"})
    public static final class ExtTemplatesScreen extends ru.nb.mce.core_ui.Screen {
        @org.jetbrains.annotations.NotNull
        public static final ru.nb.mce.core_ui.Screen.ExtTemplatesScreen INSTANCE = null;
        
        private ExtTemplatesScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/nb/mce/core_ui/Screen$MainScreen;", "Lru/nb/mce/core_ui/Screen;", "()V", "core-ui_debug"})
    public static final class MainScreen extends ru.nb.mce.core_ui.Screen {
        @org.jetbrains.annotations.NotNull
        public static final ru.nb.mce.core_ui.Screen.MainScreen INSTANCE = null;
        
        private MainScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/nb/mce/core_ui/Screen$NavEventScreen;", "Lru/nb/mce/core_ui/Screen;", "()V", "core-ui_debug"})
    public static final class NavEventScreen extends ru.nb.mce.core_ui.Screen {
        @org.jetbrains.annotations.NotNull
        public static final ru.nb.mce.core_ui.Screen.NavEventScreen INSTANCE = null;
        
        private NavEventScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/nb/mce/core_ui/Screen$NavGroupScreen;", "Lru/nb/mce/core_ui/Screen;", "()V", "core-ui_debug"})
    public static final class NavGroupScreen extends ru.nb.mce.core_ui.Screen {
        @org.jetbrains.annotations.NotNull
        public static final ru.nb.mce.core_ui.Screen.NavGroupScreen INSTANCE = null;
        
        private NavGroupScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/nb/mce/core_ui/Screen$NavPersonScreen;", "Lru/nb/mce/core_ui/Screen;", "()V", "core-ui_debug"})
    public static final class NavPersonScreen extends ru.nb.mce.core_ui.Screen {
        @org.jetbrains.annotations.NotNull
        public static final ru.nb.mce.core_ui.Screen.NavPersonScreen INSTANCE = null;
        
        private NavPersonScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/nb/mce/core_ui/Screen$NavSettingScreen;", "Lru/nb/mce/core_ui/Screen;", "()V", "core-ui_debug"})
    public static final class NavSettingScreen extends ru.nb.mce.core_ui.Screen {
        @org.jetbrains.annotations.NotNull
        public static final ru.nb.mce.core_ui.Screen.NavSettingScreen INSTANCE = null;
        
        private NavSettingScreen() {
        }
    }
}