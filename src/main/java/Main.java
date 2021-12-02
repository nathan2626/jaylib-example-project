import static com.raylib.Jaylib.RAYWHITE;
import static com.raylib.Jaylib.VIOLET;
import static com.raylib.Raylib.*;

public class Main {
    public static void main(String args[]) {
        InitWindow(800, 450, "Demo");
        SetTargetFPS(60);

        while (!WindowShouldClose()) {
            DrawGrid(20, 1.0f);
            DrawText("Hello world", 190, 200, 20, VIOLET);
            DrawFPS(20, 20);
            EndDrawing();
        }
        CloseWindow();
    }
}