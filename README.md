# Clerk/Specter interaction

This repo demonstrates a buggy interaction between [specter]'s path caches and [clerk]'s analyzer.

[specter]: https://github.com/redplanetlabs/specter
[clerk]: https://github.com/nextjournal/clerk

To reproduce run `clj -X:run ` which will open a browser. Then click on `src/com/latacora/bug.clj`.

## Context

- [Specter documentation for how the cache works](https://github.com/redplanetlabs/specter/wiki/Specter's-inline-caching-implementation)
- [Specter implementation of caching](https://github.com/redplanetlabs/specter/blob/67e86806020b9d02fbca8cdb1efad3002fc81a32/src/clj/com/rpl/specter.cljc#L268)
