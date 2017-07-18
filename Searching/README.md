Interpolation search formula:

Link: https://stackoverflow.com/questions/32330185/computing-mid-in-interpolation-search/45131360#45131360
You can think of array arr as a function f that acts on index and return a value, which is monotone (because array is sorted).
So you have your initial data f(low) = m and f(high) = M.
Now you can interpolate your function f with a straight line, which is quite reasonable to do because your f is monotone and you have only 2 points. So your interpolation should be line (linear function) that pass throw points (low, m) and (high, M). This is it's equation
(y - f(low))/(f(high) - f(low)) = (x - low)/(high - low)
So y here is the element of search space and x is from domain (x is index of array). So if your function f would be the same as it's interpolation, then index of your key would be:

x = low + (high - low)*(key - f(low))/(f(high) - f(low))

<a href="https://www.codecogs.com/eqnedit.php?latex=\left&space;(&space;y-y_{1}&space;\right&space;)&space;=&space;\frac{y_{2}-y_{1}}{x_{2}&space;-&space;x_{1}}&space;*\left&space;(&space;x&space;-&space;x_{1}&space;\right&space;)" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\left&space;(&space;y-y_{1}&space;\right&space;)&space;=&space;\frac{y_{2}-y_{1}}{x_{2}&space;-&space;x_{1}}&space;*\left&space;(&space;x&space;-&space;x_{1}&space;\right&space;)" title="\left ( y-y_{1} \right ) = \frac{y_{2}-y_{1}}{x_{2} - x_{1}} *\left ( x - x_{1} \right )" /></a>
