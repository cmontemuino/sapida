Samza Pipeline Dashboard
========================

Getting intel from Samza-based applications (Kafka topics and internal state stores) is not a straightforward task, and it usually requires
lot of manual intervention (e.g., manually consuming the Kafka topics with the console consumer utility). This may work initially, but as
soon as we get more records in the topics, correlating the information quickly turns into a complex task. In addition, if Avro (or another encoding) is used, then using
the "console consumer" tools is not the best option.
 
SaPiDa is a set of micro-services providing a Dashboard for Samza-based Pipelines, based on [Akka HTTP][Akka Http] and the
Akka Streams library [Reactive-Kafka][Reactive-Kafka].

[![Build Status](https://travis-ci.org/cmontemuino/sapida.svg?branch=master)](https://travis-ci.org/cmontemuino/sapida)
[![license](https://img.shields.io/github/license/cmontemuino/sapida.svg)](LICENSE)
[![Waffle.io - Columns and their card count](https://badge.waffle.io/cmontemuino/sapida.svg?columns=all)](https://waffle.io/cmontemuino/sapida)

Supported versions
------------------

|Kafka  | Akka version | SaPiDa
|-------|--------------|-------------------------
|0.11.x | 2.5.x        | [release 0.10](https://github.com/cmontemuino/sapida/milestone/3)

Usage
-----
### What you need
* [SBT][SBT] 1.x for building.
* [Docker Compose][Docker Compose] for spinning up Kafka, Zookeeper, and a schema registry.

### How to build

### How to run

Contributions
-------------
Contributions are very welcome!

If you seen an issue that you would like to have it fixed, the best way to make it true is to help out by submitting a pull request. Are
you looking to contribute but don't know where to start? [ticket marked as "help wanted"][Help Wanted Labeled Tickets] or
["good first issue"][Good First Issue Labeled Tickets] are a good starting point.

Please refer to [CONTRIBUTING.md](CONTRIBUTING.md) for more details.

License
-------
SaPiDa is Open Source and available under the Apache 2 License.

[Akka Http]: https://github.com/akka/akka-http
[Docker Compose]: https://docs.docker.com/compose/
[Good First Issue Labeled Tickets]: https://github.com/cmontemuino/sapida/labels/good%20first%20issue
[Help Wanted Labeled Tickets]: https://github.com/cmontemuino/sapida/labels/help%20wanted
[Reactive-Kafka]: https://github.com/akka/reactive-kafka
[SBT]: https://www.scala-sbt.org
