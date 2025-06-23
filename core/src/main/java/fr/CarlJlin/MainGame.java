package fr.CarlJlin;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class MainGame extends ApplicationAdapter {

    @Override
    public void create() {
        // Initialisation du jeu
    }

    @Override
    public void render() {
        // Effacer l'écran
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Logique de rendu du jeu
    }

    @Override
    public void dispose() {
        // Nettoyage des ressources
    }
}
