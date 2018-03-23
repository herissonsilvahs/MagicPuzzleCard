package com.herisson.game.magicpuzzlecard.main.graphics;

import com.herisson.game.magicpuzzlecard.main.commons.GameControls;

import javax.swing.*;
import java.awt.*;

public class Drawing extends GameControls
{
    private boolean visible;
    private boolean destruct;
    private int width;
    private int height;
    private int positionX = 0;
    private int positionY = 0;
    private ImageIcon image;

    public Drawing()
    {
        this.visible = true;
        this.destruct = false;
    }

    public ImageIcon getImage()
    {
        return image;
    }

    public void setImage(ImageIcon image)
    {
        this.image = image;
    }

    public boolean isVisible()
    {
        return visible;
    }

    public void setVisible(boolean visible)
    {
        this.visible = visible;
    }

    public boolean isDestruct()
    {
        return destruct;
    }

    public void setDestruct(boolean destruct)
    {
        this.destruct = destruct;
    }

    public int getPositionX()
    {
        return positionX;
    }

    public void setPositionX(int positionX)
    {
        this.positionX = positionX;
    }

    public int getPositionY()
    {
        return positionY;
    }

    public void setPositionY(int positionY)
    {
        this.positionY = positionY;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }
}
