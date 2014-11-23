BejeweledBot
============

A bot that plays bejeweled blitz so you don't have to   
https://apps.facebook.com/bejeweledblitz/?fb_source=search&ref=br_tf


<h2>Steps to run</h2>
<ol>
  <li>clone the files</li>
  <li>start a new game of bejeweled that's completely visible on your primary monitor</li>
  <li>run Bejeweled.java</li>
  <li>watch the explosions</li>
</ol>

The program will not stop until you terminate the process.  Do not move the location of the bejeweled board after execution as game window location calibration is only done at the initial execution of the program. Having a frozen instance of a bejeweled blitz game in progress may softlock your mouse due to the program wanting to make matches.
matches are determined based off pixel detection.  Most block pixels have been found but some blocks such as multipliers are not all documented.

run ColorFinder.java if you want to find out the color code for a block that's not documented. ColorFinder will generate a string grid to the console of all the RGB color codes of the current grid in Bejeweled Blitz.
