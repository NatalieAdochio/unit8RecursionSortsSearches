    public void drawFractal(Graphics2D g2, double x, double y, double length, double angle)
    {
        double fractalAng=Math.toRadians(angle);
        double findAdj= Math.cos(fractalAng)*length;
        double findOpp = Math.sin(fractalAng)*length;
        Line2D.Double fractalLine = new Line2D.Double(x,y,findOpp-x,y+findAdj); 
        g2.draw(fractalLine);
        drawFractal(g2,x,y,length-.5, currentAngle+angle);
        drawFractal(g2,x,y,length-.5,currentAngle-angle);
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
         super.paintComponent(g);
        g.setColor(Color.BLACK);
        drawFractal(g, 400, 500, -90, 9);
    }
