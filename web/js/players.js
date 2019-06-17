var tl;

tl = new TimelineMax ({repeat:-1,repeatDelay:3});


tl.set('.player', {autoAlpha: 0, scale:0.3,})
.staggerTo(".player", 0.50, {x: 0, y:0, autoAlpha:1, scale:1}, 0.7);