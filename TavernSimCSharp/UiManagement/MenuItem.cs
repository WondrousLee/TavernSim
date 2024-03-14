public class MenuItem
{
    public string Text { get; set; }
    public Action ButtonAction { get; set; }

    public MenuItem(String text, Action buttonAction)
    {
        Text = text;
        ButtonAction = buttonAction;
    }
}