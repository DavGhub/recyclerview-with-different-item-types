package com.dav.myapplication;

public class Constants {

    /*
    User profile menu titles and icons
     */

    public static final String[
            ] PROFILE_MENU_TITLES = {"My events", "My contacts", "Help", "About us",
            "Suggestions", "Dark mode" ,"Change email", "Change password",
            "Deactivate account", "Sign out"};

    public static final int[] PROFILE_MENU_ICONS = {R.drawable.ic_my_events_icon, R.drawable.ic_my_contacts, R.drawable.ic_help,
            R.drawable.ic_about_us, R.drawable.ic_suggestions, R.drawable.ic_paint_board ,R.drawable.ic_change_email,
            R.drawable.ic_lock, R.drawable.ic_user_delete, R.drawable.ic_log_out};

    public static final ProfileListItem[] PROFILE_LIST_ITEMS_ARRAY = {
            new ProfileListItem(PROFILE_MENU_ICONS[0],PROFILE_MENU_TITLES[0], ProfileItemType.CATEGORY),
            new ProfileListItem(PROFILE_MENU_ICONS[1],PROFILE_MENU_TITLES[1], ProfileItemType.CATEGORY),
            new ProfileListItem(0,"",  ProfileItemType.SPACE),
            new ProfileListItem(PROFILE_MENU_ICONS[2],PROFILE_MENU_TITLES[2], ProfileItemType.CATEGORY),
            new ProfileListItem(PROFILE_MENU_ICONS[3],PROFILE_MENU_TITLES[3], ProfileItemType.CATEGORY),
            new ProfileListItem(PROFILE_MENU_ICONS[4],PROFILE_MENU_TITLES[4], ProfileItemType.CATEGORY),
            new ProfileListItem(0,"",  ProfileItemType.SPACE),
            new ProfileListItem(PROFILE_MENU_ICONS[5],PROFILE_MENU_TITLES[5], ProfileItemType.SWITCHER),
            new ProfileListItem(PROFILE_MENU_ICONS[6],PROFILE_MENU_TITLES[6], ProfileItemType.CATEGORY),
            new ProfileListItem(PROFILE_MENU_ICONS[7],PROFILE_MENU_TITLES[7], ProfileItemType.CATEGORY),
            new ProfileListItem(PROFILE_MENU_ICONS[8],PROFILE_MENU_TITLES[8], ProfileItemType.CATEGORY),
            new ProfileListItem(0,"",  ProfileItemType.SPACE),
            new ProfileListItem(PROFILE_MENU_ICONS[9],PROFILE_MENU_TITLES[9], ProfileItemType.CATEGORY),
            new ProfileListItem(0,"",  ProfileItemType.SPACE)};

}
