### Monitor System Resources Using Netdata

### 1. Run Netdata in Docker

```
docker run -d --name=netdata \
  -p 19999:19999 \
  --cap-add SYS_PTRACE \
  --security-opt apparmor=unconfined \
  netdata/netdata
```



-d → run in background

--name=netdata → container name

-p 19999:19999 → expose Netdata on port 19999

--cap-add SYS_PTRACE & --security-opt apparmor=unconfined → required for monitoring

### 2. Access the Dashboard

Open browser → http://localhost:19999

You’ll see a real-time monitoring dashboard.


### 3. Monitor Metrics

Netdata shows:

CPU usage (per core, load, interrupts)

Memory usage (RAM, swap)

Disk I/O (read/write per disk, latency)

Network traffic (per interface, bandwidth, errors)

Docker containers (CPU, memory, bandwidth, disk usage per container)

### 4. Explore Alerts & Panels

Netdata has default alerts (high CPU, RAM pressure, low disk space).

Explore chart panels → hover for details, zoom in/out.

### 5. Check Logs

Logs are inside the container at:

```
docker exec -it netdata bash
cat /var/log/netdata/error.log
```
